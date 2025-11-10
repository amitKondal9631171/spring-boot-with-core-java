package capgemini.exam.scb.streams;

import java.util.concurrent.atomic.AtomicInteger;

public class FixedWindowRateLimiter {
    private final int maxRequestsPerSec;
    private final AtomicInteger requestCount = new AtomicInteger(0);
    private volatile long windowStart = System.currentTimeMillis();

    public FixedWindowRateLimiter(int maxRequestsPerSec) {
        this.maxRequestsPerSec = maxRequestsPerSec;
    }

    public synchronized boolean allowRequest() {
        long now = System.currentTimeMillis();

        // If 1 second passed, reset counter
        if (now - windowStart >= 1000) {
            windowStart = now;
            requestCount.set(0);
        }

        if (requestCount.incrementAndGet() <= maxRequestsPerSec) {
            return true; // ✅ allowed
        } else {
            return false; // ❌ blocked
        }
    }
}