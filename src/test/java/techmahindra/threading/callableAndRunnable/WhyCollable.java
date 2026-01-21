package techmahindra.threading.callableAndRunnable;


import java.util.concurrent.*;

//It helps to return the value from the thread
//throw checked exception from the thread

/**
 * How it works
 *  The exception thrown inside call() is wrapped in an ExecutionException by the Future.
 *  You retrieve the original cause using e.getCause().
 */
public class WhyCollable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Task started by " + Thread.currentThread().getName());
             if (true) {
                throw new Exception("Something went wrong!");
            }
            return 42; // This line won't be reached
        };

        Future<Integer> future = executor.submit(task);

        try {
            // get() will throw ExecutionException if Callable threw an exception
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (ExecutionException e) {
            System.err.println("Task failed with exception: " + e.getCause().getMessage());
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted.");
        } finally {
            executor.shutdown();
        }
    }
}
