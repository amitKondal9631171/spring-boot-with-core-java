package techmahindra.threading.callableAndRunnable;

import java.util.concurrent.*;

/**
 * Created by user on 8/8/2020.
 */
public class CallableVsRunnable {

    private static Callable<String> stringCallable = () -> {
        return "return from callable block";
    };

    private static Runnable runnable = () -> {
        System.out.println("Inside the runnable block");
    };

    public static void main(String[] args) {

        //can not pass callable implementation to thread
        new Thread(runnable).start();

        //callable requires executor service and can not pass Runnable implementation to it.
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> callableReturn = service.submit(stringCallable);
        try {
            System.out.println(callableReturn.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }

}
