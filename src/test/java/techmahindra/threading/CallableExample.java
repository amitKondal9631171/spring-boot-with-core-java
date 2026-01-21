package techmahindra.threading;

import java.util.concurrent.*;

class SumTask implements Callable<Integer> {
    private final int n;

    public SumTask(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + " computed sum up to " + n);
        return sum;
    }
}

/**
 * Implement a `Callable<Integer>` that computes the sum of numbers from 1 to N. Use an `ExecutorService` with a fixed thread pool of size 2 to run 3 such
 *  tasks and print their results.
 *
 */
public class CallableExample {
    public static void main(String[] args) {
        // Fixed thread pool of size 2
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            // Submit 3 tasks
            Future<Integer> f1 = executor.submit(new SumTask(10));
            Future<Integer> f2 = executor.submit(new SumTask(20));
            Future<Integer> f3 = executor.submit(new SumTask(30));

            // Get results (blocking until done)
            System.out.println("Result 1: " + f1.get());
            System.out.println("Result 2: " + f2.get());
            System.out.println("Result 3: " + f3.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Always shut down executor
        }
    }
}
