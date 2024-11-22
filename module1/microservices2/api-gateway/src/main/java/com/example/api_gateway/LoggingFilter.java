
package com.example.api_gateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filt
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Override
public Mono<Void> filter(ServerWebExchange exchange,GatewayFilterChain chain) {
    // Log the incoming request path
    System.out.println("Request Path: " + exchange.getRequest().getURI().getPath());

    // You can also log other information, like headers, request parameters, etc.
    exchange.getRequest().getHeaders().forEach((key, value) ->
            System.out.println(key + ":" + value)
    );

    // Continue with the filter chain
    return chain.filter(exchange);
}