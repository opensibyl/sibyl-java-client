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

import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.model.ServiceFunctionContextChain;
import com.github.opensibyl.client.model.ServiceFunctionContextReverseChain;
import com.github.opensibyl.client.model.Sibyl2FunctionContextSlim;
import com.github.opensibyl.client.model.Sibyl2FunctionWithPath;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for SignatureQueryApi
 */
@Disabled
public class SignatureQueryApiTest {

    private final com.github.opensibyl.client.api.SignatureQueryApi api = new SignatureQueryApi();

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1SignatureFuncGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String signature = null;
        Sibyl2FunctionWithPath response = api.apiV1SignatureFuncGet(repo, rev, signature);
        // TODO: test validations
    }

    /**
     * funcctx query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1SignatureFuncctxGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String signature = null;
        Sibyl2FunctionContextSlim response = api.apiV1SignatureFuncctxGet(repo, rev, signature);
        // TODO: test validations
    }

    /**
     * funcctx reverse chain query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1SignatureFuncctxRchainGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String signature = null;
        Integer depth = null;
        ServiceFunctionContextChain response = api.apiV1SignatureFuncctxRchainGet(repo, rev, signature, depth);
        // TODO: test validations
    }

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1SignatureRegexFuncGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String regex = null;
        List<String> response = api.apiV1SignatureRegexFuncGet(repo, rev, regex);
        // TODO: test validations
    }

}
