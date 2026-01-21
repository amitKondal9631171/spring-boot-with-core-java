package com.learning.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetrySynchronizationManager;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ThirdPartyService {

    @Retryable(interceptor = "customRetryInterceptor",
            value = { HttpServerErrorException.class })
    public String callThirdPartyApi() throws URISyntaxException {
        System.out.println("Attempting to call third-party API...");
        long startTime = System.currentTimeMillis();
        try {
            return new RestTemplate().getForObject(new URI("http://localhost:3434/get"), String.class);
        } finally {
            long executionTime = System.currentTimeMillis() - startTime;
            RetrySynchronizationManager.getContext().setAttribute("EXEC_TIME", executionTime);
        }
    }

    @Recover
    public String recover(HttpServerErrorException e) {
        return "Fallback response after retries exhausted";
    }
}

