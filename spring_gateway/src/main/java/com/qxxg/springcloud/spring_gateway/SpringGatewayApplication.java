package com.qxxg.springcloud.spring_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@EnableEurekaClient
@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGatewayApplication.class, args);
    }

    @Bean(name = "hostAddrKeyResolver")
    public KeyResolver hostAddrKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    //@Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }

    //@Bean
    KeyResolver apiKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }
}
