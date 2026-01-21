package techmahindra.threading.exceptions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RejectedExecutionExceptionExp {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.shutdown();
        executor.submit(() -> System.out.println("Task")); // ❌ RejectedExecutionException

    }
}
