package techmahindra.threading.concurrency;

import techmahindra.threading.model.Resource;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class TestReentrantlock {



    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(1);
         Resource resource = new Resource();

         Integer a = 12;

         int v= a;


        Runnable r1 = () -> {
            //created dummy object to have lock on this resource
            synchronized (resource) {
                resource.doLogging();
            }
        };
        Runnable r2 = () -> {
            try {
                 lock.lock();
                    resource.doLogging();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        };
        Runnable r3 = () -> {
            try {
                lock.lock();
                resource.doLogging();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        };
        Runnable r4 = () -> {
            try {
                lock.lock();
                resource.doLogging();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        };
        Runnable r5 = () -> {
            try {
                lock.lock();
                resource.doLogging();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        };

        Callable<String> objWhoReturnValue = ()->{
            return "Callable Thread executed successfully";
        };

        Future<String> returnFromThread = executors.submit(objWhoReturnValue);

        try {
            System.out.println(returnFromThread.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executors.submit(r1); executors.submit(r2);executors.submit(r3); executors.submit(r4);


        executors.submit(r5);
        //stops the currently executing thread after the thread completion processing..
        executors.shutdown();
        //stops the service wihtout wating for complete execution of the service.
       // executors.shutdownNow();
    }
}
