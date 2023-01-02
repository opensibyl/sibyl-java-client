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


import org.openapitools.client.model.ObjectFunctionWithSignature;
import org.openapitools.client.model.Sibyl2ClazzWithPath;
import org.openapitools.client.model.Sibyl2FunctionContext;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MainApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MainApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MainApi(ApiClient apiClient) {
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
     * Build call for apiV1ClazzGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ClazzGetCall(String repo, String rev, String _file, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/clazz";

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

        if (_file != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file", _file));
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
    private okhttp3.Call apiV1ClazzGetValidateBeforeCall(String repo, String rev, String _file, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1ClazzGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1ClazzGet(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling apiV1ClazzGet(Async)");
        }

        return apiV1ClazzGetCall(repo, rev, _file, _callback);

    }

    /**
     * class query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @return List&lt;Sibyl2ClazzWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2ClazzWithPath> apiV1ClazzGet(String repo, String rev, String _file) throws ApiException {
        ApiResponse<List<Sibyl2ClazzWithPath>> localVarResp = apiV1ClazzGetWithHttpInfo(repo, rev, _file);
        return localVarResp.getData();
    }

    /**
     * class query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @return ApiResponse&lt;List&lt;Sibyl2ClazzWithPath&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2ClazzWithPath>> apiV1ClazzGetWithHttpInfo(String repo, String rev, String _file) throws ApiException {
        okhttp3.Call localVarCall = apiV1ClazzGetValidateBeforeCall(repo, rev, _file, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * class query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ClazzGetAsync(String repo, String rev, String _file, final ApiCallback<List<Sibyl2ClazzWithPath>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1ClazzGetValidateBeforeCall(repo, rev, _file, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FileGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FileGetCall(String repo, String rev, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/file";

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
    private okhttp3.Call apiV1FileGetValidateBeforeCall(String repo, String rev, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FileGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FileGet(Async)");
        }

        return apiV1FileGetCall(repo, rev, _callback);

    }

    /**
     * file query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> apiV1FileGet(String repo, String rev) throws ApiException {
        ApiResponse<List<String>> localVarResp = apiV1FileGetWithHttpInfo(repo, rev);
        return localVarResp.getData();
    }

    /**
     * file query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> apiV1FileGetWithHttpInfo(String repo, String rev) throws ApiException {
        okhttp3.Call localVarCall = apiV1FileGetValidateBeforeCall(repo, rev, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * file query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FileGetAsync(String repo, String rev, final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FileGetValidateBeforeCall(repo, rev, _callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncGetCall(String repo, String rev, String _file, String lines, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/func";

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

        if (_file != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file", _file));
        }

        if (lines != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lines", lines));
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
    private okhttp3.Call apiV1FuncGetValidateBeforeCall(String repo, String rev, String _file, String lines, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncGet(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling apiV1FuncGet(Async)");
        }

        return apiV1FuncGetCall(repo, rev, _file, lines, _callback);

    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @return List&lt;ObjectFunctionWithSignature&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ObjectFunctionWithSignature> apiV1FuncGet(String repo, String rev, String _file, String lines) throws ApiException {
        ApiResponse<List<ObjectFunctionWithSignature>> localVarResp = apiV1FuncGetWithHttpInfo(repo, rev, _file, lines);
        return localVarResp.getData();
    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @return ApiResponse&lt;List&lt;ObjectFunctionWithSignature&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ObjectFunctionWithSignature>> apiV1FuncGetWithHttpInfo(String repo, String rev, String _file, String lines) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncGetValidateBeforeCall(repo, rev, _file, lines, null);
        Type localVarReturnType = new TypeToken<List<ObjectFunctionWithSignature>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncGetAsync(String repo, String rev, String _file, String lines, final ApiCallback<List<ObjectFunctionWithSignature>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncGetValidateBeforeCall(repo, rev, _file, lines, _callback);
        Type localVarReturnType = new TypeToken<List<ObjectFunctionWithSignature>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncctxGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncctxGetCall(String repo, String rev, String _file, String lines, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/funcctx";

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

        if (_file != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file", _file));
        }

        if (lines != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lines", lines));
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
    private okhttp3.Call apiV1FuncctxGetValidateBeforeCall(String repo, String rev, String _file, String lines, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncctxGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncctxGet(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling apiV1FuncctxGet(Async)");
        }

        return apiV1FuncctxGetCall(repo, rev, _file, lines, _callback);

    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @return List&lt;Sibyl2FunctionContext&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionContext> apiV1FuncctxGet(String repo, String rev, String _file, String lines) throws ApiException {
        ApiResponse<List<Sibyl2FunctionContext>> localVarResp = apiV1FuncctxGetWithHttpInfo(repo, rev, _file, lines);
        return localVarResp.getData();
    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionContext&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionContext>> apiV1FuncctxGetWithHttpInfo(String repo, String rev, String _file, String lines) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncctxGetValidateBeforeCall(repo, rev, _file, lines, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func ctx query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param _file file (required)
     * @param lines specific lines (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncctxGetAsync(String repo, String rev, String _file, String lines, final ApiCallback<List<Sibyl2FunctionContext>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncctxGetValidateBeforeCall(repo, rev, _file, lines, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1RepoGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1RepoGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/repo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call apiV1RepoGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return apiV1RepoGetCall(_callback);

    }

    /**
     * repo query
     * 
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> apiV1RepoGet() throws ApiException {
        ApiResponse<List<String>> localVarResp = apiV1RepoGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * repo query
     * 
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> apiV1RepoGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = apiV1RepoGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * repo query (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1RepoGetAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1RepoGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1RevGet
     * @param repo rev search by repo (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1RevGetCall(String repo, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/rev";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
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
    private okhttp3.Call apiV1RevGetValidateBeforeCall(String repo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1RevGet(Async)");
        }

        return apiV1RevGetCall(repo, _callback);

    }

    /**
     * rev query
     * 
     * @param repo rev search by repo (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> apiV1RevGet(String repo) throws ApiException {
        ApiResponse<List<String>> localVarResp = apiV1RevGetWithHttpInfo(repo);
        return localVarResp.getData();
    }

    /**
     * rev query
     * 
     * @param repo rev search by repo (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> apiV1RevGetWithHttpInfo(String repo) throws ApiException {
        okhttp3.Call localVarCall = apiV1RevGetValidateBeforeCall(repo, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * rev query (asynchronously)
     * 
     * @param repo rev search by repo (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1RevGetAsync(String repo, final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1RevGetValidateBeforeCall(repo, _callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
