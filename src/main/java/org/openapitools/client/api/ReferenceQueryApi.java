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


import org.openapitools.client.model.Sibyl2FunctionContextSlim;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReferenceQueryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReferenceQueryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReferenceQueryApi(ApiClient apiClient) {
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
     * Build call for apiV1ReferenceCountFuncctxGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ReferenceCountFuncctxGetCall(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/reference/count/funcctx";

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

        if (moreThan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("moreThan", moreThan));
        }

        if (lessThan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lessThan", lessThan));
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
    private okhttp3.Call apiV1ReferenceCountFuncctxGetValidateBeforeCall(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1ReferenceCountFuncctxGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1ReferenceCountFuncctxGet(Async)");
        }

        // verify the required parameter 'moreThan' is set
        if (moreThan == null) {
            throw new ApiException("Missing the required parameter 'moreThan' when calling apiV1ReferenceCountFuncctxGet(Async)");
        }

        // verify the required parameter 'lessThan' is set
        if (lessThan == null) {
            throw new ApiException("Missing the required parameter 'lessThan' when calling apiV1ReferenceCountFuncctxGet(Async)");
        }

        return apiV1ReferenceCountFuncctxGetCall(repo, rev, moreThan, lessThan, _callback);

    }

    /**
     * funcctx query by ref
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @return List&lt;Sibyl2FunctionContextSlim&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionContextSlim> apiV1ReferenceCountFuncctxGet(String repo, String rev, Integer moreThan, Integer lessThan) throws ApiException {
        ApiResponse<List<Sibyl2FunctionContextSlim>> localVarResp = apiV1ReferenceCountFuncctxGetWithHttpInfo(repo, rev, moreThan, lessThan);
        return localVarResp.getData();
    }

    /**
     * funcctx query by ref
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionContextSlim&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionContextSlim>> apiV1ReferenceCountFuncctxGetWithHttpInfo(String repo, String rev, Integer moreThan, Integer lessThan) throws ApiException {
        okhttp3.Call localVarCall = apiV1ReferenceCountFuncctxGetValidateBeforeCall(repo, rev, moreThan, lessThan, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContextSlim>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * funcctx query by ref (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ReferenceCountFuncctxGetAsync(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback<List<Sibyl2FunctionContextSlim>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1ReferenceCountFuncctxGetValidateBeforeCall(repo, rev, moreThan, lessThan, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContextSlim>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1ReferenceCountFuncctxReverseGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ReferenceCountFuncctxReverseGetCall(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/reference/count/funcctx/reverse";

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

        if (moreThan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("moreThan", moreThan));
        }

        if (lessThan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lessThan", lessThan));
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
    private okhttp3.Call apiV1ReferenceCountFuncctxReverseGetValidateBeforeCall(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1ReferenceCountFuncctxReverseGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1ReferenceCountFuncctxReverseGet(Async)");
        }

        // verify the required parameter 'moreThan' is set
        if (moreThan == null) {
            throw new ApiException("Missing the required parameter 'moreThan' when calling apiV1ReferenceCountFuncctxReverseGet(Async)");
        }

        // verify the required parameter 'lessThan' is set
        if (lessThan == null) {
            throw new ApiException("Missing the required parameter 'lessThan' when calling apiV1ReferenceCountFuncctxReverseGet(Async)");
        }

        return apiV1ReferenceCountFuncctxReverseGetCall(repo, rev, moreThan, lessThan, _callback);

    }

    /**
     * funcctx query by referenced
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @return List&lt;Sibyl2FunctionContextSlim&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionContextSlim> apiV1ReferenceCountFuncctxReverseGet(String repo, String rev, Integer moreThan, Integer lessThan) throws ApiException {
        ApiResponse<List<Sibyl2FunctionContextSlim>> localVarResp = apiV1ReferenceCountFuncctxReverseGetWithHttpInfo(repo, rev, moreThan, lessThan);
        return localVarResp.getData();
    }

    /**
     * funcctx query by referenced
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionContextSlim&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionContextSlim>> apiV1ReferenceCountFuncctxReverseGetWithHttpInfo(String repo, String rev, Integer moreThan, Integer lessThan) throws ApiException {
        okhttp3.Call localVarCall = apiV1ReferenceCountFuncctxReverseGetValidateBeforeCall(repo, rev, moreThan, lessThan, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContextSlim>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * funcctx query by referenced (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param moreThan moreThan (required)
     * @param lessThan lessThan (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ReferenceCountFuncctxReverseGetAsync(String repo, String rev, Integer moreThan, Integer lessThan, final ApiCallback<List<Sibyl2FunctionContextSlim>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1ReferenceCountFuncctxReverseGetValidateBeforeCall(repo, rev, moreThan, lessThan, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContextSlim>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
