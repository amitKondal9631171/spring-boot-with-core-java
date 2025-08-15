package techmahindra.threading.Concepts;

import techmahindra.threading.model.Resource;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 8/4/2020.
 */
public class DeadLockTest {


    public static void main(String[] args) {
        // creating one object
        Resource s1 = new Resource();

        // creating second object
        Resource s2 = new Resource();

        Runnable r1  =  () -> {
            /**
             * locked resource s1 and sending s2 which will call another method but below thread
             * will acquire a lock on s2.
             */
            s1.callUnlockedMethodFromLocked();
            //s1.resourceOne(s2);
        };
        Runnable r2  =  () -> {
            /**
             * locked resource s2 and sending s1 which will call another method but above thread
             * will have lock on s1.
             */
            s1.unLockedMethod();
            //s2.resourceTwo(s1);
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(r1);executorService.submit(r2);
        executorService.shutdown();



    }

}
