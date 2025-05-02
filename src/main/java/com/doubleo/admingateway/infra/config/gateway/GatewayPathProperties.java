package com.doubleo.admingateway.infra.config.gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("security.endpoints")
public record GatewayPathProperties(
        List<Endpoint> publicEndpoints, List<Endpoint> protectedEndpoints) {
    public record Endpoint(String path, List<String> methods) {}
}
