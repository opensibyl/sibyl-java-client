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
import org.openapitools.client.model.Sibyl2ClazzWithPath;
import org.openapitools.client.model.Sibyl2FunctionContext;
import org.openapitools.client.model.Sibyl2FunctionWithPath;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegexQueryApi
 */
@Disabled
public class RegexQueryApiTest {

    private final RegexQueryApi api = new RegexQueryApi();

    /**
     * clazz query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1ClazzWithRegexGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String field = null;
        String regex = null;
        List<Sibyl2ClazzWithPath> response = api.apiV1ClazzWithRegexGet(repo, rev, field, regex);
        // TODO: test validations
    }

    /**
     * func query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1FuncWithRegexGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String field = null;
        String regex = null;
        List<Sibyl2FunctionWithPath> response = api.apiV1FuncWithRegexGet(repo, rev, field, regex);
        // TODO: test validations
    }

    /**
     * func ctx query
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1FuncctxWithRegexGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        String field = null;
        String regex = null;
        List<Sibyl2FunctionContext> response = api.apiV1FuncctxWithRegexGet(repo, rev, field, regex);
        // TODO: test validations
    }

}