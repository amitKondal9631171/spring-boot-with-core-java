package techmahindra.threading.exceptions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutionExceptionExp {

    public static void main(String[] args) {

        String nullString = null;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> nullString.trim()); // division by zero

        try {
            System.out.println(future.get());
        } catch (java.util.concurrent.ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            executor.shutdown();
        }


    }
}
