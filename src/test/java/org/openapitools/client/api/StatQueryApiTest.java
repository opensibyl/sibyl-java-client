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
import org.openapitools.client.model.ServiceRevStat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatQueryApi
 */
@Disabled
public class StatQueryApiTest {

    private final StatQueryApi api = new StatQueryApi();

    /**
     * rev stat
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1RevStatGetTest() throws ApiException {
        String repo = null;
        String rev = null;
        ServiceRevStat response = api.apiV1RevStatGet(repo, rev);
        // TODO: test validations
    }

}
