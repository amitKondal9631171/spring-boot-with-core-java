package capgemini.exam.scb.streams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RateLimiterDemo {
    public static void main(String[] args) {
        FixedWindowRateLimiter limiter = new FixedWindowRateLimiter(5); // allow 5 requests/sec
        ExecutorService pool = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            if (limiter.allowRequest()) {
                System.out.println(Thread.currentThread().getName() + " → Allowed");
            } else {
                System.out.println(Thread.currentThread().getName() + " → Blocked");
            }
        };

        // Simulate 20 requests quickly
        for (int i = 0; i < 20; i++) {
            pool.submit(task);
        }

        pool.shutdown();
    }
}
