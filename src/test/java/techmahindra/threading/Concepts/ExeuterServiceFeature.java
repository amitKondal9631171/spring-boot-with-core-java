package techmahindra.threading.Concepts;

import java.util.concurrent.*;

/**
 * Created by user on 8/7/2020.
 */
public class ExeuterServiceFeature {

    private static Runnable r1 = () -> {
        System.out.println("First Runable service");
    };
    private static Runnable r2 = () -> {
        System.out.println("Sec Runable service");
    };
    private static Runnable r3 = () -> {
        System.out.println("Third Runable service");
    };

    //using lambda to give method body no anonymous class will be created....
    private static Callable<Integer> callableInteger = () -> {return 1;};

    private static Callable<String> callableString = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "callable String returned";
        }
    };

    static Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    private static void executorService(){

        ExecutorService executorsService = Executors.newFixedThreadPool(5);
        Future<Integer> callableIntegerReturn = executorsService.submit(callableInteger);
        Future<String> callableStringReturn = executorsService.submit(callableString);
        executorsService.execute(runnable);

        try {
            System.out.println(callableIntegerReturn.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(callableStringReturn.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void scheduleService(){

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        //will be executed only once....
        scheduledExecutorService.schedule(callableString, 1, TimeUnit.SECONDS);
        //will delay the execution for 2 secs after the execution of previous execution
        scheduledExecutorService.scheduleWithFixedDelay(r1, 1, 2, TimeUnit.SECONDS);
        //will execute after every for 2 secs. dosen not matter previous execution is completed or not.
        ScheduledFuture future = scheduledExecutorService.scheduleWithFixedDelay(r1, 1, 2, TimeUnit.SECONDS);

    }

    public static void main(String[] args) throws Exception{
        scheduleService();
        executorService();
    }
}
