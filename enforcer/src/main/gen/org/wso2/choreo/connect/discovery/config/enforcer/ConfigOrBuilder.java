// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/config.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.wso2.discovery.config.enforcer.Security security = 1;</code>
   * @return Whether the security field is set.
   */
  boolean hasSecurity();
  /**
   * <code>.wso2.discovery.config.enforcer.Security security = 1;</code>
   * @return The security.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.Security getSecurity();
  /**
   * <code>.wso2.discovery.config.enforcer.Security security = 1;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.SecurityOrBuilder getSecurityOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.CertStore keystore = 2;</code>
   * @return Whether the keystore field is set.
   */
  boolean hasKeystore();
  /**
   * <code>.wso2.discovery.config.enforcer.CertStore keystore = 2;</code>
   * @return The keystore.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.CertStore getKeystore();
  /**
   * <code>.wso2.discovery.config.enforcer.CertStore keystore = 2;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.CertStoreOrBuilder getKeystoreOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.CertStore truststore = 3;</code>
   * @return Whether the truststore field is set.
   */
  boolean hasTruststore();
  /**
   * <code>.wso2.discovery.config.enforcer.CertStore truststore = 3;</code>
   * @return The truststore.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.CertStore getTruststore();
  /**
   * <code>.wso2.discovery.config.enforcer.CertStore truststore = 3;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.CertStoreOrBuilder getTruststoreOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.Service authService = 5;</code>
   * @return Whether the authService field is set.
   */
  boolean hasAuthService();
  /**
   * <code>.wso2.discovery.config.enforcer.Service authService = 5;</code>
   * @return The authService.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.Service getAuthService();
  /**
   * <code>.wso2.discovery.config.enforcer.Service authService = 5;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.ServiceOrBuilder getAuthServiceOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.AmCredentials apimCredentials = 6;</code>
   * @return Whether the apimCredentials field is set.
   */
  boolean hasApimCredentials();
  /**
   * <code>.wso2.discovery.config.enforcer.AmCredentials apimCredentials = 6;</code>
   * @return The apimCredentials.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.AmCredentials getApimCredentials();
  /**
   * <code>.wso2.discovery.config.enforcer.AmCredentials apimCredentials = 6;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.AmCredentialsOrBuilder getApimCredentialsOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.JWTGenerator jwtGenerator = 7;</code>
   * @return Whether the jwtGenerator field is set.
   */
  boolean hasJwtGenerator();
  /**
   * <code>.wso2.discovery.config.enforcer.JWTGenerator jwtGenerator = 7;</code>
   * @return The jwtGenerator.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.JWTGenerator getJwtGenerator();
  /**
   * <code>.wso2.discovery.config.enforcer.JWTGenerator jwtGenerator = 7;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.JWTGeneratorOrBuilder getJwtGeneratorOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.Throttling throttling = 8;</code>
   * @return Whether the throttling field is set.
   */
  boolean hasThrottling();
  /**
   * <code>.wso2.discovery.config.enforcer.Throttling throttling = 8;</code>
   * @return The throttling.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.Throttling getThrottling();
  /**
   * <code>.wso2.discovery.config.enforcer.Throttling throttling = 8;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.ThrottlingOrBuilder getThrottlingOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.Cache cache = 9;</code>
   * @return Whether the cache field is set.
   */
  boolean hasCache();
  /**
   * <code>.wso2.discovery.config.enforcer.Cache cache = 9;</code>
   * @return The cache.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.Cache getCache();
  /**
   * <code>.wso2.discovery.config.enforcer.Cache cache = 9;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.CacheOrBuilder getCacheOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.JWTIssuer jwtIssuer = 10;</code>
   * @return Whether the jwtIssuer field is set.
   */
  boolean hasJwtIssuer();
  /**
   * <code>.wso2.discovery.config.enforcer.JWTIssuer jwtIssuer = 10;</code>
   * @return The jwtIssuer.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.JWTIssuer getJwtIssuer();
  /**
   * <code>.wso2.discovery.config.enforcer.JWTIssuer jwtIssuer = 10;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.JWTIssuerOrBuilder getJwtIssuerOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.Analytics analytics = 11;</code>
   * @return Whether the analytics field is set.
   */
  boolean hasAnalytics();
  /**
   * <code>.wso2.discovery.config.enforcer.Analytics analytics = 11;</code>
   * @return The analytics.
   */
  org.wso2.choreo.connect.discovery.config.enforcer.Analytics getAnalytics();
  /**
   * <code>.wso2.discovery.config.enforcer.Analytics analytics = 11;</code>
   */
  org.wso2.choreo.connect.discovery.config.enforcer.AnalyticsOrBuilder getAnalyticsOrBuilder();

  /**
   * <code>.wso2.discovery.config.enforcer.AuthHeader authHeader = 12;</code>
   * @return Whether the authHeader field is set.
   */
  boolean hasAuthHeader();
  /**
   * <code>.wso2.discovery.config.enforcer.AuthHeader authHeader = 12;</code>
   * @return The authHeader.
   */
  org.wso2.gateway.discovery.config.enforcer.AuthHeader getAuthHeader();
  /**
   * <code>.wso2.discovery.config.enforcer.AuthHeader authHeader = 12;</code>
   */
  org.wso2.gateway.discovery.config.enforcer.AuthHeaderOrBuilder getAuthHeaderOrBuilder();
}
