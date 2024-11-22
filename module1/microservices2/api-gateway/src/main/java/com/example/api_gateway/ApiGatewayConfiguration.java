package com.example.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/get")
//                        .filters(f -> f.addRequestHeader("X-Request-Foo", "Bar"))
//                        .uri("http://httpbin.org:80"))
//                .build();
//    }
//        return builder.routes()
//                .route(r -> r.path("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
//                        .uri("lb:currency-conversion-service"))
//                .build();

//        return builder.routes()
//                .route(r -> r.path("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
//                        .uri("lb://currency-conversion-service"))  // lb:// indicates the use of Load Balancer to resolve the service name
//                .build();
//        return builder.routes()
//                // Route for the currency exchange request
//                .route(r -> r.path("/currency-exchange/from/{from}/to/{to}")
//                        .uri("lb://currency-exchange-service"))  // Load balancing to the service
//                .build();
        return builder.routes()
                // Route for /api/currency-exchange/from/{from}/to/{to}
                .route(r -> r.path("/api/currency-exchange/from/{from}/to/{to}")
                        .uri("lb://currency-exchange-service"))  // Load balancing to the service if using service discovery
                .build();

    }
}