/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.113
 * Contact: noc@tripartie.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tripartie.safecheckout.auth;

/**
 * OAuth flows that are supported by this client
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T13:50:36.452269Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
