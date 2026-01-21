package techmahindra.threading.exceptions;
import java.util.concurrent.*;

public class TimeoutExceptionExp {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(3000);
            return "Done";
        });

        try {
            try {
                System.out.println(future.get(1, TimeUnit.SECONDS)); // ❌ TimeoutException
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } catch (TimeoutException e) {
            System.out.println("Task timed out!");
        }
        executor.shutdown();

    }
}
