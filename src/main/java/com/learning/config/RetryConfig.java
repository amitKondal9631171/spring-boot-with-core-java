package com.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

@Configuration
public class RetryConfig {

    public final ThreadLocal<Long> executionTimeHolder = new ThreadLocal<>();

    // Custom retry listener
    @Bean
    public RetryListener retryListener() {
        return new RetryListener() {
            @Override
            public <T, E extends Throwable> boolean open(RetryContext context, RetryCallback<T, E> callback) {
                return true; // Continue with retry
            }

            @Override
            public <T, E extends Throwable> void close(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
                executionTimeHolder.remove(); // Clean up the ThreadLocal
            }

            @Override
            public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
                Long lastExecutionTime = executionTimeHolder.get();
                if (lastExecutionTime != null && lastExecutionTime >= 400) {
                    // If execution time was >= 100ms, mark the retry context to stop retrying
                    context.setExhaustedOnly();
                }
            }
        };
    }
}
