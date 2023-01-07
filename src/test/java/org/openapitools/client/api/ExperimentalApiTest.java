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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Sibyl2FunctionWithPath;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExperimentalApi
 */
@Disabled
public class ExperimentalApiTest {

    private final ExperimentalApi api = new ExperimentalApi();

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1FuncSignatureGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String regex = null;
        List<String> response = api.apiV1FuncSignatureGet(repo, rev, regex);
        // TODO: test validations
    }

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1FuncWithRuleGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String rule = null;
        List<Sibyl2FunctionWithPath> response = api.apiV1FuncWithRuleGet(repo, rev, rule);
        // TODO: test validations
    }

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1FuncWithSignatureGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String signature = null;
        List<Sibyl2FunctionWithPath> response = api.apiV1FuncWithSignatureGet(repo, rev, signature);
        // TODO: test validations
    }

}
