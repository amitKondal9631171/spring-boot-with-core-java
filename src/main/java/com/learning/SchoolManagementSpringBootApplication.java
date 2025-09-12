package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.client.RestTemplate;

@EnableRetry
@SpringBootApplication
public class SchoolManagementSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementSpringBootApplication.class, args);
     }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
