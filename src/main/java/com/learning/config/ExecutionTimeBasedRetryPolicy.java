package com.learning.config;

import org.springframework.retry.RetryContext;
import org.springframework.retry.policy.SimpleRetryPolicy;

public class ExecutionTimeBasedRetryPolicy extends SimpleRetryPolicy {

    private final long maxDuration;

    public ExecutionTimeBasedRetryPolicy(int maxAttempts, long maxDuration) {
        super(maxAttempts);
        this.maxDuration = maxDuration;
    }

    @Override
    public boolean canRetry(RetryContext context) {
        Object attr = context.getAttribute("EXEC_TIME");
        if (attr instanceof Long) {
            Long duration = (Long) attr;
            if (duration >= maxDuration) {
                return false; // stop retrying if previous attempt too slow
            }
        }
        return super.canRetry(context);
    }
}
