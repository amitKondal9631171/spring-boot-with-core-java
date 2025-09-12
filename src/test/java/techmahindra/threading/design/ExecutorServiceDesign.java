package techmahindra.threading.design;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceDesign {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        AtomicInteger count = new AtomicInteger(1);

        ThreadFactory namedFactory = r -> {
            Thread t = new Thread(r);
            t.setName("MyPool-Worker-" + count.getAndIncrement());
            return t;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.submit(() ->
                    System.out.println("Running in: " + Thread.currentThread().getName())
            );
        }

        System.out.println("ExecutorService executed in: " + (System.currentTimeMillis() - start) );

        Future<Integer> result = executorService.submit(() -> {
            System.out.println("Callable task running in " + Thread.currentThread().getName());
            Thread.sleep(500);
            return 42;
        });

        try {
            System.out.println("Return from thread: " + result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();

        System.out.println("Available processors in system: "+Runtime.getRuntime().availableProcessors());
    }
}
