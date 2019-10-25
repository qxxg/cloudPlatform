package com.qxxg.springcloud.clouduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@ComponentScan("com.qxxg.springcloud")
@EnableEurekaClient
@SpringBootApplication
public class CloudUserApplication {

        public static void main(String[] args) {
            SpringApplication.run(CloudUserApplication.class, args);
        }

}
