package com.qxxg.springcloud.spring_gateway.route;

import com.qxxg.springcloud.spring_gateway.filter.RateLimitByPathGatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * @Author SmallSand
 * @Date 2019/10/23  17:46
 */
//@Configuration
public class UserRoute {

   // @Bean
    public RouteLocator userRouteLocator(RouteLocatorBuilder builder) {
        System.out.println("=========================================");
        return builder.routes().route(r -> r.path("/cloud-user/user/*")
                .filters(f -> f.stripPrefix(1).filter(new RateLimitByPathGatewayFilter(2, 1, Duration.ofSeconds(1))))
                .uri("lb://CONSUMER").order(0).id("cloud-user")).build();
    }
}
