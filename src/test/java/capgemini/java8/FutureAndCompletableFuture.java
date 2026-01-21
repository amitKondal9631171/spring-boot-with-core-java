package capgemini.java8;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Completable future is introduced in java8
 *
 */
public class FutureAndCompletableFuture {

    static void completableExample(){

        //Async stages are always scheduled as new tasks.
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                            System.out.println("Completable Future Thread name: " + Thread.currentThread().getName());
                            sleep(1000);

                             return "Hello";
                        })
                        .thenApplyAsync(result -> {
                            System.out.println("ThenApplyAsync for concatenation Thread name: " + Thread.currentThread().getName());
                            return result.toString() + " from CompletableFuture";
                        })

                        .thenApplyAsync(v-> {
                            System.out.println("ThenApplyAsync for upperCase Thread name: " + Thread.currentThread().getName());
                            return v.toUpperCase();
                        })
                        .exceptionally(str -> "Exception message: ".concat(str.getMessage())); //execution starts


        future.thenAccept(System.out::println);

        //Pause this thread until the async task finishes, then give me the value
        String response = future.join(); // wait for response, join throws no exception
        System.out.println("From join: "+response);


        try {
            String result = future.get();
            System.out.println("From get: "+result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }


    }
    static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void combiningMultipleAsyncCalls(){

        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> combined =
                f1.thenCombine(f2, Integer::sum);

        combined.thenAccept(System.out::println); // 30


        combined.join();
    }

    public static void main(String[] args) {
        completableExample();
    }
}
