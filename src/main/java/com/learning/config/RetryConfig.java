package com.learning.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.RetryPolicy;
import org.springframework.retry.interceptor.RetryInterceptorBuilder;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

@Configuration
public class RetryConfig {

    @Bean
    public RetryPolicy executionTimeRetryPolicy() {
        // allow up to 3 retries, but stop if any attempt >= 400ms
        return new ExecutionTimeBasedRetryPolicy(3, 400);
    }


    @Bean(name = "customRetryInterceptor")
    public RetryOperationsInterceptor customRetryInterceptor(RetryPolicy executionTimeRetryPolicy) {
        return RetryInterceptorBuilder.stateless()
                .retryPolicy(executionTimeRetryPolicy)
                .build();
    }
}
