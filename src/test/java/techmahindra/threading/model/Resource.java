package techmahindra.threading.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 8/3/2020.
 */
public class Resource {

    public String threadName;
    Lock lock = new ReentrantLock();
    /**
     * doSomething and doLogging is used to Learning Reentrant lock
     */
    public void doSomething(){
        System.out.println("Function for business requirement");
    }

    public void doLogging(){
        System.out.println("Function for logging purposes");
    }


    /**
     * resourceOne and resourceTwo is used to learning dead lock
     * @param sharedResource
     */
    // first synchronized method
    public /*synchronized*/ void resourceOne(Resource sharedResource)
    {
        lock.lock();
        System.out.println("test1-begin");
        Util.sleep(1000);
        // taking object lock of s2 enters
        // into test2 method
        sharedResource.resourceTwo(this);
        System.out.println("test1-end");
        lock.unlock();
    }

    public /*synchronized*/ void unLockedMethod(){
        System.out.println("Unlocked method called");
        lock.unlock();
    }
    // second synchronized method
    public /*synchronized*/ void resourceTwo(Resource sharedResource)
    {
        lock.lock();
        System.out.println("test2-begin");
        Util.sleep(1000);
        // taking object lock of s1 enters
        // into test1 method
        sharedResource.resourceOne(this);
        System.out.println("test2-end");
        lock.unlock();
    }

    public /*synchronized*/ void callUnlockedMethodFromLocked(){
        lock.lock();
        System.out.println("going to call unlocked method");
        unLockedMethod();
        System.out.println("Unlocked method called successfully");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //lock.unlock();
    }
}
